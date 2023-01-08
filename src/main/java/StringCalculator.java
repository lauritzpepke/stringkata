


public class StringCalculator {

    public static void main(String[] args) {
        add("0");
        add("1\n2,3");
        add("1,2");
    }

    public static int add(String numbers) {
        String a = numbers;
        String operators[]=a.split("[0-9]+");
        String operands[]=a.split("[,\n]");
        int agregate = Integer.parseInt(operands[0]);
        for(int i=1; i < operands.length; i++) {
            if(operators[i].equals(",") || operators[i].equals("\n"))
                agregate += Integer.parseInt(operands[i]);
            else
                agregate -= Integer.parseInt(operands[i]);
        }
        System.out.println(agregate);
        return agregate;
    }

}
