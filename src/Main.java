public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen March");
        System.out.println("Pelicula: Matrix");


        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media= (8.2 + 6.0+9.0)/3;
        System.out.println("La media de las notas es: " + media);

        String sinopsis = """
                Matrix es una paradoja 
                La mejor pelicula  del fin del milenio
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion =(int) media /2;

        System.out.println("La clasificacion de la pelicula es: " + clasificacion);

    }
}