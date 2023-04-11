package pb2.unlam.edu.ar;

public class SalaDeCine {
	
	Private int[][] butacas; // Matriz que representa las butacas de la sala

    public SalaDeCine(int filas, int asientosPorFila) {
        butacas = new int[filas][asientosPorFila]; // Inicializar la matriz de butacas
    }

    public boolean estaVacia() {
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[0].length; j++) {
                if (butacas[i][j] != 0) { // Si alguna butaca está ocupada, la sala no está vacía
                    return false;
                }
            }
        }
        return true; // Si todas las butacas están libres, la sala está vacía
    }

    public boolean estaButacaOcupada(int fila, int asiento) {
        if (fila < 0 || fila >= butacas.length || asiento < 0 || asiento >= butacas[0].length) {
            throw new IllegalArgumentException("Butaca fuera de rango"); // Lanzar una excepción si la butaca está fuera de rango
        }
        return butacas[fila][asiento] != 0; // Devolver true si la butaca está ocupada, false si está libre
    }
	public void ocuparButaca() {}
	
	public void consultarCantidadTotalButacasOcupadas() {}

	public void consultarSiSePuedeAcomodarUnGrupoDePersonasJuntas() {}
}
