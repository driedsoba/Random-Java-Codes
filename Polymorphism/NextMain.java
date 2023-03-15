public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        // not the best way to test for runtime type
        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if(unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if(unknownObject instanceof Adventure) { // better way
            ((Adventure) unknownObject).watchMovie();;
        } else if (unknownObject instanceof ScienceFiction syfy) {  // different version
            syfy.watchScienceFiction();
        }
    }
}
