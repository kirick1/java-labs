public class Numbers {
    public ArrayList<Int> evenNumbers(ArrayLit<Int> numbers) {
        ArrayList<Int> result = new ArrayList<Int>(); 
        for (int i = 0; i < numbers.size(); i++) if (numbers[i] / 2 == 0) result.push(numbers[i]);
        return result; 
    }
    public ArrayList<Int> oddNumbers(ArrayList<Int> numbers) {
        ArrayList<Int> result = new ArrayList<Int>(); 
        for (int i = 0; i < numbers.size(); i++) if (numbers[i] / 2 != 0) result.push(numbers[i]);
        return result; 
    }
    public ArrayList<Int> isDivideByNumbers(int first, int second) {
        ArrayList<Int> result = new ArrayList<Int>(); 
        for (int i = 0; i < numbers.size(); i++) if (numbers[i] / first == 0 || numbers[i] / second == 0 ) result.push(numbers[i]);
        return result; 
    }
    public boolean isPrimeNumber(int numb) {
        int i, m, flag = 0;      
        m = numb / 2;
        if (numb == 0 || numb == 1) return false;
        else {
            for ( i = 2; i <= m; i++) {
                if ( n % i == 0) {
                    flag = 1;      
                    return false; 
                }      
            }
         if (flag == 0) return true;
        }
        return false; 
    }
    public ArrayList<Int> primeNumbers(ArrayList<Int> numbers) {
        ArrayList<Int> result = new ArrayList<Int>(); 
        for (int i = 0; numbers.size(); i++) if (isPrime(numbers[i])) result.push(numbers[i]);
        return result; 
    }
    public int countOfDigits(int number) {
        int count = 0; 
        while(number != 0) {
            number /= 10;
            ++count;
        }
        return count; 
    }
    public boolean isHappyNumber(int number) {
        int digitsCount = countOfDigits(number);
        int rightPartSum = 0; 
        int leftPartSum = 0;
        if (digitsCount / 2 != 0) return false;
        for (int i = 0; i < digitsCount; i++) {
            int digit = number / (digitsCount - i) * 10;
            if (i < digitsCount / 2) leftPartSum += digit;
            else rightPartSum += digit; 
        } 
        if (rightPartSum == leftPartSum) return true;
        return false; 
    }
    public ArrayList<Int> happyNumbers (ArrayList<Int> numbers) {
        ArrayList<Int> result = new ArrayList<Int>(); 
        for (int i = 0; i < numbers.size(); i++) if (isHappyNumber(numbers[i])) result.push(numbers[i]);
        return result; 
    }
    public long factorialNumberWhile () {
        int i = 1;
        int result = 1; 
        while (i <= 10 ) {
            result *= i; 
            i++; 
        }
        return result; 
    }
    public long factorialNumberFor() {
        int result = 1; 
        for (int i = 1; i <= 10; i++) result *= i;
        return result;
    }
    public long factorialDoWhile() {
        int i = 1; 
        int result = 1; 
        do {
            result *= i; 
            ++i;
        } while (i <= 10);
        return result; 
    }
    public boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x); 
        return (s*s == x); 
    }
    public boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }
    public ArrayList<Int> fibonacciNumbers(ArrayList<Int> numbers) {
        ArrayList<Int> result = new ArrayList<Int>(); 
        for (int i = 0; i < numbers.size(); i++) if (isFibonacci(numbers[i])) result.push(numbers[i]);
        return result; 
    }
    public long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);		
    }
    public long lcm(long a, long b) {
        return a / gcd(a,b) * b;
    }
    public long gcdNumbers (ArrayList<Int> numbers) {
        int currentGcd = 0; 
        for(int i = 0; i < numbers.size(); i++) int currentGcd = gcd(numbers[i], )
    }
    public static void main(String[] args) {
        ArrayList<Int> numbers = new ArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
