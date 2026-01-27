class ArmstrongNumber {

    static boolean isArmstrong(int n) {
        int original = n;
        int digits = 0;
        int temp = n;

        // Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = n;

        // Calculate sum of digits^digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int n = 153;

        if (isArmstrong(n)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
