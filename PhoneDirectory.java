class PhoneDirectory {

    private boolean[] isNumberAvailable;

    // Tc: O(n)
    // Sc: O(n)
    public PhoneDirectory(int maxNumbers) {
        isNumberAvailable = new boolean[maxNumbers];
        for (int i = 0; i < maxNumbers; i++) {
            isNumberAvailable[i] = true;
        }
    }

    // Tc: O(n)
    public int get() {
        for (int i = 0; i < isNumberAvailable.length; i++) {
            if (isNumberAvailable[i]) {
                isNumberAvailable[i] = false;
                return i;
            }
        }
        return -1;
    }

    // Tc: O(1)
    public boolean check(int number) {
        return number >= 0 && number < isNumberAvailable.length && isNumberAvailable[number];
    }

    // Tc: O(1)
    public void release(int number) {
        if (number >= 0 && number < isNumberAvailable.length) {
            isNumberAvailable[number] = true; // Mark the number as available again.
        }
    }
}