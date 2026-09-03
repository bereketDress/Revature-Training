package rev.ass1;

public class LoopChallenge {
    public void printForLoop(){
        for(int i=1;i<=5;i++){
            System.out.println(i);

        }
    }
    public void printWhileLoop(){
        int i=1;
        while(i>=1 && i<=5){
            System.out.println(i);
            i++;
        }

    }
    public void printDoWhileLoop() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
    public static void main(String[] args) {
        LoopChallenge l=new LoopChallenge();
        l.printForLoop();
        l.printWhileLoop();
    }

}
