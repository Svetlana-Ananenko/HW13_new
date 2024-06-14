public class Author {

    private String authorName;
    private String authorSurname;


    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public String toString () {
        return " Автор: " + this.authorName + this.authorSurname;
    }

    public int hashCode() {
        return java.util.Objects.hash(authorName, authorSurname);
    }

    public boolean equals(Author other) {
        if (this.getClass() != other.getClass()) {
            return false;

        } else {

            return this.toString().equalsIgnoreCase(other.toString());
        }
    }




}
