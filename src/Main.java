public class Main {
    public static void main(String[] args) {


        Author tolstoy = new Author("Лев ", "Толстой");
        Book warAndPeace = new Book("Война и мир", tolstoy, 1873);
        System.out.println((warAndPeace));

        Author dostoevskiy = new Author("Фёдор ", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevskiy, 1866);
        System.out.println((crimeAndPunishment));

        crimeAndPunishment.setYearBook (2015);
        System.out.println((crimeAndPunishment));

        System.out.print("\nCравним две книги через метод иквэлс, результат: ");
        System.out.println( warAndPeace.equals(crimeAndPunishment));

        System.out.print("\n Метод ХЭШ код: ");
        System.out.println(warAndPeace.hashCode());


    }
}