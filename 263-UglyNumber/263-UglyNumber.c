// Last updated: 2/13/2026, 9:44:53 AM
#include <stdbool.h>

bool isUgly(int n) {
    if (n <= 0) {
        return false;
    }
    int factors[] = {2, 3, 5};
    int i;

    for (i = 0; i < 3; i++) {
        while (n % factors[i] == 0) {
            n /= factors[i];
        }
    }
    return n == 1;
}
