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


    public boolean equals(Object other) {
        if (this.getClass(authorName) != other.getClass(authorName) || this.getClass(authorSurname) != other.getClass(authorSurname)) {
            return false;
        } else {
            return true;
        }


    }




}
