#include <iostream>
#include <string>

using namespace std;

int main() {
    string pass = "admin123";
    string input;
    
    cout << "Enter Password: ";
    cin >> input;

    if (input == pass) {
        cout << "Welcome\n";
    } else {
        cout << "Wrong Password\n";
    }
    
    return 0;
}