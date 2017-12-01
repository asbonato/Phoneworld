package br.usjt.ftce.arqdesis.phoneworld;

/**
 * Created by asbonato on 01/12/17.
 */

public class Conversor
{
    public static String converter(String phone){
        String resultado = "";

        for(int i = 0; i < phone.length(); i++){
            switch (phone.toUpperCase().substring(i, i+1)){
                case "A":
                case "B":
                case "C":
                    resultado+="2";
                    break;
                case "D":
                case "E":
                case "F":
                    resultado+="3";
                    break;
                case "G":
                case "H":
                case "I":
                    resultado+="4";
                    break;
                case "J":
                case "K":
                case "L":
                    resultado+="5";
                    break;
                case "M":
                case "N":
                case "O":
                    resultado+="6";
                    break;
                case "P":
                case "Q":
                case "R":
                case "S":
                    resultado+="7";
                    break;
                case "T":
                case "U":
                case "V":
                    resultado+="8";
                    break;
                case "W":
                case "X":
                case "Y":
                case "Z":
                    resultado+="9";
                    break;
                default:
                    resultado+=phone.substring(i, i+1);
            }
        }

        return resultado;
    }
}
