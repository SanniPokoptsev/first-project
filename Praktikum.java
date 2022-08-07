public static void printStudentsList() {
    String[] students = {"Иванова Маша",
        "Петров Вася",
        "Барабулькин Семён",
        "Печенькина Оля",
        "Краснова Катя",
        "Захаров Слава"};
    int studentsCount = students.length;
    System.out.println("Всего в классе " + studentsCount + " учеников:");

    for (int i = 0; i < studentsCount; i++) {
        System.out.println(students[i]);
    }
} 