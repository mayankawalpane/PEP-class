#include <iostream>
using namespace std;

int main() {
    for (int i = 1; i <= 4; i++) {
        int num = 2 * i - 1;
        for (int j = 1; j <= 5; j++) {
            cout << num << " ";
            num += 2;
        }
        cout << endl;
    }
    return 0;
}