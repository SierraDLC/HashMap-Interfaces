package HashMap;
public class Book {
    private String name;
    private int publicationYear;
    private String contents;

    public Book(String name, int publicationYear, String contents) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.contents = contents;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getContents() {
        return this.contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " (" + getPublicationYear() + ")\n" 
        + "Contents: " + getContents();
    }
}