public class TestMain {
    public static void main(String[] args) {
        Punto puntoRojo = new Punto();
        puntoRojo.setSistema(Sistema.PLANO);
        puntoRojo.setEtiqueta("ROJO");
        puntoRojo.setX(4);
        puntoRojo.setY(1.3);

        Punto puntoVerde = new Punto();
        puntoVerde.setSistema(Sistema.PLANO);
        puntoVerde.setEtiqueta("VERDE");
        puntoVerde.setX(6);
        puntoVerde.setY(2.7);

    }
}
