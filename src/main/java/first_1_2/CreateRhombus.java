package first_1_2;

public class CreateRhombus {
    String s = " ";
    String p = " +";
    public void createRhombus(int size) {
        int width =size;
        int height =0;

        for (int k = 0; k < size; k++) {
            for (int n = 0; n<width-height; n++){
                System.out.print(s);

            }
            for (int n = -1; n< k; n++){
                System.out.print(p);
            }
            System.out.println();
            height++;
        }
        size--;
        height= height-2;
        for (int k = size-1; k >=0; k--) {
            for (int n = 0; n<width-height; n++){
                System.out.print(s);

            }
            for (int n = -1; n< k; n++){
                System.out.print(p);
            }
            System.out.println();
            height--;
        }

    }
}
