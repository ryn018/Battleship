class Army {

    public static void createArmy() {
        // Create all objects here
        Unit alpha1 = new Unit("Alpha1");
        Unit alpha2 = new Unit("Alpha2");
        Unit alpha3 = new Unit("Alpha3");
        Unit alpha4 = new Unit("Alpha4");
        Unit alpha5 = new Unit("Alpha5");
        //alpha.countUnit = 5;

        Knight knight1 = new Knight("knight1");
        Knight knight2 = new Knight("knight2");
        Knight knight3 = new Knight("knight3");
        //knight.countKnight = 3;

        General general = new General("general");
        //general.countGeneral = 1;

        Doctor doctor = new Doctor("doctor");
        //docter.countDoctor = 1;


    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}