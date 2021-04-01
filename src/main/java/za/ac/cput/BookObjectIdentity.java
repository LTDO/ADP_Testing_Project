/**
 * BookObjectIdentity.java
 * This is a concrete class for a BookIdentity object
 * @author Lunga Tshila
 * Date: Tuesday, 30 March 2021
 * ObjectIdentity
 */

package za.ac.cput;
public class BookObjectIdentity {
        private final String title, author;

        public BookObjectIdentity(String title, String author) {
            if (title == null || author == null)
                throw new NullPointerException();

            this.title = title;
            this.author = author;
        }

        public String title() {
            return title;
        }

        public String author() {
            return author;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other)
                return true;
            if (!(other instanceof BookObjectIdentity))
                return false;

            BookObjectIdentity book = (BookObjectIdentity) other;
            return title.equals(book.title) &&
                    author.equals(book.author);
        }

        @Override
        public int hashCode() {
            return title.hashCode() + author.hashCode() * 7;
        }

        @Override
        public String toString() {
            return "\"" + title + "\" by " + author;
        }
}
