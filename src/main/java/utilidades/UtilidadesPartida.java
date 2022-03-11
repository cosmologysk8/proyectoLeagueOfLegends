package utilidades;

import modelos.Jugador;
import modelos.Partida;
import modelos.Personaje;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class UtilidadesPartida implements IUtilidadesPartida{

    @Override
    public void inicializarPartida(Partida partida, List<Jugador> participantes, List<Personaje> personajesDisponibles) {

       for (Jugador j: participantes){
            for(Personaje p : personajesDisponibles){
                for (Personaje f : j.getPersonajesFavoritos()){
                    if (p == f){
                        partida.getElecciones().put(j, p);
                        personajesDisponibles.remove(p);
                        break;
                    }
                    else {
                        partida.getElecciones().put(j,p);
                        personajesDisponibles.remove(p);
                        break;
                    }
                }

            }
       }

       for (Jugador jg : participantes){
           int team = (int) Math.floor(Math.random());
       }

       partida.getJugadoresPorEquipo().put(1,null);
       partida.getJugadoresPorEquipo().put(2, null);

        for (Jugador j : participantes){
            int eleccion_equipo = (int) Math.floor(Math.random()*1+2);
            partida.setJugadoresPorEquipo();

        }

        LocalDateTime incio = partida.getInicioPartida();
    }

    @Override
    public void finalizarPartida(Partida partida, Integer equipoVencedor) {
        LocalDateTime fin = partida.getFinPartida();
    }
}
