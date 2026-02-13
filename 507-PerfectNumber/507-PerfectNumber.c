// Last updated: 2/13/2026, 9:44:34 AM

bool checkPerfectNumber(int num) {
    if (num == 1) return false;
    int divSum = 1;
    for (int i = 2; i<=num/2; i++) {
        if (num%i == 0) divSum += i;
    }
    return divSum == num;
}
