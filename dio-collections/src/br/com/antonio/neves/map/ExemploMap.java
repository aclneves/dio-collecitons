package br.com.antonio.neves.map;

/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */


import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e sues respectivos consumos: ");
        Map<String, Double> carros_populares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carros_populares + "\n");

        System.out.println("Substitua o consumo do gol por 15.2: ");
        carros_populares.put("gol", 15.2);
        System.out.println(carros_populares + "\n");

        System.out.println("Confira se o modelo Tucson está no dicionário: ");
        System.out.println(carros_populares.containsKey("Tucson") + "\n");

        System.out.println("Exiba o consumo do Uno: ");
        System.out.println(carros_populares.get("Uno") + "\n");

        System.out.println("Exiba o terceiro modelo adicionado: ");
        System.out.println("Não é possível com Hashmap" + "\n");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carros_populares.keySet();
        System.out.println(modelos + "\n");

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carros_populares.values();
        System.out.println(consumos + "\n");

        System.out.println("Exiba o modelo mais eficiente: ");
        Double consumo_mais_eficiente = Collections.max(carros_populares.values());
        Set<Map.Entry<String, Double>> entries = carros_populares.entrySet();
        String modelo_mais_eficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumo_mais_eficiente)) {
                modelo_mais_eficiente = entry.getKey();
                System.out.println(modelo_mais_eficiente + " - " + consumo_mais_eficiente + "\n");
            }
        }

        System.out.println("Exiba o modelo menos econômico: ");
        Double consumo_menos_eficiente = Collections.min(carros_populares.values());
        String modelo_menos_eficiente = "";
        for (Map.Entry<String, Double> entry : carros_populares.entrySet()) {
            if (entry.getValue().equals(consumo_menos_eficiente)) {
                modelo_menos_eficiente = entry.getKey();
                System.out.println(modelo_menos_eficiente + " - " + consumo_menos_eficiente + "\n");
            }
        }

        System.out.println("Exima a soma dos consumos: ");
        Iterator<Double> iterator = carros_populares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext())
            soma += iterator.next();
        System.out.println(soma + "\n");

        System.out.println("Exiba a média dos consumos deste dicionário de carros: ");
        System.out.println(soma/carros_populares.size() + "\n");

        System.out.println("Remova os modelos com consumo igual a 15,6 km/l");

        Iterator<Double> iterator1 = carros_populares.values().iterator();
        while (iterator1.hasNext())
            if (iterator1.next().equals(15.6))
                iterator1.remove();
        System.out.println(carros_populares + "\n");

        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carros_populares1 = new LinkedHashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carros_populares1 + "\n");

        System.out.println("Exiba o dicionários ordenado pelo modelo: ");
        Map<String, Double> carro_populares2 = new TreeMap<>(carros_populares1);
        System.out.println(carro_populares2 + "\n");

        System.out.println("Apague o dicionário de carros: ");
        carros_populares.clear();
        System.out.println(carros_populares + "\n");

        System.out.println("Confira se o dicionário está vazio: ");
        System.out.println(carros_populares.isEmpty());




    }


}
