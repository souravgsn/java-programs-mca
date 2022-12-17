//Explore the basic java program development scenario in Notepad++ and cmd by creating a class Integer Adder. 
//The adder prints sum of 5 integer numbers without using a single variable where input will be taken through command line arguments.

class ap1{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]); 
        }
        System.out.println(sum);
    }
}