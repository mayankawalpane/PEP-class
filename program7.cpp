#include <iostream>
#include <string>
#include <termios.h>
#include <unistd.h>
#include <stdio.h>

using namespace std;

int getch() {
    int ch;
    struct termios t_old, t_new;

    tcgetattr(STDIN_FILENO, &t_old);
    t_new = t_old;
    t_new.c_lflag &= ~(ICANON | ECHO);
    tcsetattr(STDIN_FILENO, TCSANOW, &t_new);

    ch = getchar();

    tcsetattr(STDIN_FILENO, TCSANOW, &t_old);
    return ch;
}

int main() {
    string pass = "admin123";
    string input = "";
    
    cout << "Enter Password: ";
    
    while (true) {
        int ch = getch();
        
    
        if (ch == '\n' || ch == EOF) {
            cout << endl;
            break;
        } 
        
        else if (ch == 127 || ch == 8) {
            if (!input.empty()) {
                input.pop_back();
                cout << "\b \b"; 
            }
        } 
    
        else {
            input += (char)ch;
            cout << '*';         
        }
    }

    if (input == pass) {
        cout << "Welcome\n";
    } else {
        cout << "Wrong password\n";
    }
    
    return 0;
}