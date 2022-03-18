public class StringList {
    String[] stringList;
    private int length_sum = 0;

    public StringList() {
        this.stringList = new String[]{};
    }

    public void display() {
        for (int i = 0; i < this.stringList.length; i++) {
            System.out.print(this.stringList[i] + " ");
        }
        System.out.println();
    }

    public void push(String str_to_push) {
        int str_to_push_length = str_to_push.length();
        this.length_sum += str_to_push_length;
        if (this.stringList.length == 0) {
            this.stringList = new String[]{str_to_push};
            return;
        }

        //BINARY SEARCH
        int LEFT_BORDER = 0;
        int RIGHT_BORDER = this.stringList.length;
        int MIDDLE_VALUE_INDEX = 0;
        int counter_to_exit_while = 0;
        while (LEFT_BORDER < RIGHT_BORDER - 1) {//((str_to_push.length() > RIGHT_BORDER) | (str_to_push.length() < LEFT_BORDER)) {
            //System.out.println(LEFT_BORDER + " " + RIGHT_BORDER + " " + MIDDLE_VALUE_INDEX+"-"+stringList[MIDDLE_VALUE_INDEX].length());
            if (stringList[MIDDLE_VALUE_INDEX].length() > str_to_push_length) {
                RIGHT_BORDER = MIDDLE_VALUE_INDEX;
            } else {
                LEFT_BORDER = MIDDLE_VALUE_INDEX;
            }
            MIDDLE_VALUE_INDEX = (RIGHT_BORDER + LEFT_BORDER) / 2;
            counter_to_exit_while++;
            if (counter_to_exit_while > 10) {
                return;
            }
        }

        insert(MIDDLE_VALUE_INDEX + 1, str_to_push);

    }

    public String getStringMaxLength() {
        return this.stringList[this.stringList.length - 1];
    }

    public void insert(int index, String str_to_insert) {
        String[] list_with_insert = new String[this.stringList.length + 1];
        for (int i = 0; i < index; i++) {
            list_with_insert[i] = this.stringList[i];
        }
        list_with_insert[index] = str_to_insert;
        for (int i = index + 1; i < this.stringList.length + 1; i++) {
            list_with_insert[i] = this.stringList[i - 1];
        }
        this.stringList = list_with_insert;
    }

    public double getAverage() {
        return ((double) this.length_sum) / ((double) this.stringList.length);
    }
}
