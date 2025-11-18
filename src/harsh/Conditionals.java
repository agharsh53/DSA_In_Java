package harsh;

public class Conditionals {
    public static void main(String[] args) {
        /*
        syntax of if statements:
        if (boolen expression T or F){
            //body
        }
        else{
        //do this
        }
         */
        int salary = 25400;
        if(salary>=10000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 1000;
        }
        System.out.println(salary);

        //Multiple if else condition
        if(salary>=10000){
            salary += 2000;
        } else if (salary>=1000) {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
