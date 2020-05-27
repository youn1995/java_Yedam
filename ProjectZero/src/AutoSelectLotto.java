
public class AutoSelectLotto {
    public static void main(String[] args) {
        startNumPick();


    }
    public static void startNumPick() {
        int numberArray[] = new int[6];

        int ranNum;
        
        for (int i = 0; i < numberArray.length; i++) {
            ranNum = (int) (Math.random()*6) + 1;
            numberArray[i] = ranNum;
        }

        for (int i=0; i<numberArray.length; i++) {
            for (int j=0; j<i; j++) {
                boolean loopingNumber = true;
                if (numberArray[i] == numberArray[j]) {
                    while(loopingNumber) {
                        numberArray[j] = (int) (Math.random()*6) + 1;
                        if(numberArray[i] != numberArray[j]) {
                            loopingNumber = false;
                        } 
                    }
                } 
                
            }
        }
        
        for (int i = 0; i < numberArray.length; i++) {
        System.out.println(numberArray[i]);
        }
    }

}