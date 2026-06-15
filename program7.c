#include <stdio.h>
#include <string.h>

int main() {
    char pass[30] = "admin123";
    char input[30];
    int i = 0;
    char ch;
    
    printf("Enter Password: ");
    
    while (1) {
        ch = getchar();
        if (ch == '\n' || ch == EOF) {
            input[i] = '\0'; 
            break;
        }
        input[i] = ch;
        i++;
    }