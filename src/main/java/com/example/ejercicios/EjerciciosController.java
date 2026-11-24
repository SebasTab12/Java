package com.example.ejercicios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EjerciciosController {

    private final List<Ejercicio> ejercicios = List.of(
            new Ejercicio(
                    "sentadilla",
                    List.of("cuádriceps", "glúteos", "isquiotibiales"),
                    List.of("barra", "peso corporal"),
                    "3-4 series x 8-12 repeticiones",
                    List.of("Fuerza de piernas", "Hipertrofia", "Mejora de la postura"),
                    List.of("Lesión de rodilla", "Dolor lumbar"),
                    List.of("Rodillas hacia dentro", "Levantar los talones"),
                    List.of("Mantener el pecho arriba", "Bajar hasta que el muslo quede paralelo al suelo")
            ),
            new Ejercicio(
                    "press de banca",
                    List.of("pectoral mayor", "tríceps", "deltoides anterior"),
                    List.of("barra", "banco plano"),
                    "3-4 series x 6-10 repeticiones",
                    List.of("Fuerza de empuje", "Hipertrofia de pecho"),
                    List.of("Lesión de hombro", "Lesión de muñeca"),
                    List.of("Arquear demasiado la espalda", "Rebotar la barra en el pecho"),
                    List.of("Retraer las escápulas", "Usar un compañero o seguros")
            ),
            new Ejercicio(
                    "peso muerto",
                    List.of("isquiotibiales", "glúteos", "espalda baja"),
                    List.of("barra", "discos"),
                    "3-4 series x 5-8 repeticiones",
                    List.of("Fuerza general", "Cadena posterior"),
                    List.of("Hernia discal", "Dolor lumbar"),
                    List.of("Redondear la espalda", "Alejar la barra del cuerpo"),
                    List.of("Mantener la barra pegada a las piernas", "Empujar el suelo con los pies")
            ),
            new Ejercicio(
                    "dominadas",
                    List.of("dorsal ancho", "bíceps", "romboides"),
                    List.of("barra de dominadas"),
                    "3 series x 6-12 repeticiones",
                    List.of("Fuerza de tracción", "Espalda fuerte"),
                    List.of("Lesión de hombro", "Epicondilitis"),
                    List.of("Balancearse para subir", "No completar el recorrido"),
                    List.of("Usar banda elástica si es necesario", "Bajar de forma controlada")
            ),
            new Ejercicio(
                    "zancadas",
                    List.of("cuádriceps", "glúteos", "isquiotibiales"),
                    List.of("mancuernas", "peso corporal"),
                    "3 series x 10-12 repeticiones por pierna",
                    List.of("Equilibrio", "Fuerza unilateral"),
                    List.of("Lesión de rodilla", "Problemas de equilibrio"),
                    List.of("Inclinar el torso hacia adelante", "Rodilla que pasa la punta del pie"),
                    List.of("Dar un paso amplio", "Mantener el torso recto")
            ),
            new Ejercicio(
                    "press militar",
                    List.of("deltoides", "tríceps", "trapecio"),
                    List.of("barra", "mancuernas"),
                    "3-4 series x 8-12 repeticiones",
                    List.of("Fuerza de hombros", "Estabilidad del core"),
                    List.of("Lesión de hombro", "Cervicalgia"),
                    List.of("Arquear la espalda", "Subir la barra por delante de la cara"),
                    List.of("Activar el core", "No bloquear la respiración")
            ),
            new Ejercicio(
                    "curl de bíceps",
                    List.of("bíceps", "braquial"),
                    List.of("mancuernas", "barra"),
                    "3 series x 10-15 repeticiones",
                    List.of("Hipertrofia de brazos", "Fuerza de agarre"),
                    List.of("Epicondilitis", "Lesión de muñeca"),
                    List.of("Balancear el torso", "Usar impulso"),
                    List.of("Mantener los codos pegados al torso", "Bajar de forma controlada")
            ),
            new Ejercicio(
                    "fondos en paralelas",
                    List.of("tríceps", "pectoral mayor", "deltoides anterior"),
                    List.of("paralelas"),
                    "3 series x 8-12 repeticiones",
                    List.of("Fuerza de empuje", "Hipertrofia de tríceps"),
                    List.of("Lesión de hombro", "Lesión de codo"),
                    List.of("Bajar demasiado", "Adelantar los hombros"),
                    List.of("Mantener los codos cerca del cuerpo", "Bajar hasta 90 grados")
            ),
            new Ejercicio(
                    "plancha abdominal",
                    List.of("core", "recto abdominal", "oblicuos"),
                    List.of("colchoneta"),
                    "3 series x 30-60 segundos",
                    List.of("Estabilidad del core", "Prevención de dolor lumbar"),
                    List.of("Dolor lumbar", "Lesión de hombro"),
                    List.of("Elevar la cadera", "Hundir la zona lumbar"),
                    List.of("Alinear cabeza, cadera y talones", "Respirar de forma constante")
            ),
            new Ejercicio(
                    "hip thrust",
                    List.of("glúteos", "isquiotibiales"),
                    List.of("barra", "banco"),
                    "3-4 series x 10-15 repeticiones",
                    List.of("Fuerza de glúteos", "Potencia de cadera"),
                    List.of("Dolor lumbar", "Lesión de cadera"),
                    List.of("Hiperextender la espalda", "Empujar con los talones"),
                    List.of("Mantener el mentón al pecho", "Apretar los glúteos arriba")
            )
    );

    @GetMapping("/")
    public String prueba(){
        return "Hola mundo";
    }

    @GetMapping("/ejercicios")
    public List<Ejercicio> listaDeEjercicios(){
        return ejercicios;
    }

    @GetMapping("/musculo")
    public List<Ejercicio> musculo(@RequestParam String musculo){
        List<Ejercicio> ejerciciosConMusculo = new ArrayList<>();
        for(Ejercicio ejercicio:ejercicios){
            if(ejercicio.getMusculos().contains(musculo)){
                ejerciciosConMusculo.add(ejercicio);
            }
        }
        return ejerciciosConMusculo;
    }

}
