    // Encapsulation means restricting the data making the variables as private by using getters and setters method
    class Encapsul
    {
        private int num;
        private String s;
        public void setnum(int num)
        {
            this.num = num;
        }
        public int getnum()
        {
            return num;
        }
        public void sets(String s)
        {
            this.s=s;
        }
        public String gets()
        {
            return s;
        }

        public static void main(String[] args) {
            Encapsul e= new Encapsul();
            e.setnum(5);
            System.out.println(e.getnum());
            e.sets("charan");
            System.out.println(e.gets());
        }
    }
