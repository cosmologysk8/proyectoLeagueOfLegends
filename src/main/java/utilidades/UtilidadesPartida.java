package utilidades;

import modelos.Jugador;
import modelos.Partida;
import modelos.Personaje;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

       HashSet<Jugador> jugadores_equipo_1 = new HashSet<>();
       HashSet<Jugador> jugadores_equipo_2 = new HashSet<>();

       while (jugadores_equipo_1.size() < 5 && jugadores_equipo_2.size() < 5){
           for (Jugador j : participantes){
               jugadores_equipo_1.add(j);
               jugadores_equipo_2.add(j);
           }
       }

        partida.getJugadoresPorEquipo().put(1,jugadores_equipo_1);
        partida.getJugadoresPorEquipo().put(2, jugadores_equipo_2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime inicio = LocalDateTime.parse(dtf.format(LocalDateTime.now()));
        partida.setInicioPartida(inicio);
    }

    @Override
    public void finalizarPartida(Partida partida, Integer equipoVencedor) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime fin = LocalDateTime.parse(dtf.format(LocalDateTime.now()));
        partida.setFinPartida(fin);

        // Duration duracion = Duration.between(partida.getInicioPartida(), partida.getFinPartida());
        // duracion.getSeconds();

        long duracion_2 = partida.getInicioPartida().until(partida.getFinPartida(), ChronoUnit.SECONDS);
        int duracion_total = (int) duracion_2;
        partida.setDuracionPartida(duracion_total);

        partida.setEquipoVencedor(equipoVencedor);



    }
}
