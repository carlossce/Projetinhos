package com.github.carlossce.string_validarEmail.antes_Pettern;

public class ValidadorEmail {

    public static boolean validar(String email) {
        int posicao = email.indexOf("@");
        int posicao2 = email.indexOf("@", posicao + 1);
        boolean valido = posicao2 >= 0;

        if (email == null || email.isEmpty()) {
            return false;
        }

        if (!email.contains("@")) {
            return false;
        }

        if (!email.contains(".com")) {
            if (!email.contains(".me")) {
                return false;
            }
        }

        if (email.contains("..") || email.contains("@.") || email.contains(" ") || email.contains("@.") ||
                email.contains("#") || email.contains("$") || email.contains("%") || email.contains("*") ||
                email.contains("+") || email.contains(".com@")) {
            return false;
        }


        if (posicao == 0 || valido) {
            return false;
        }

        for (int i = posicao; i < email.length(); i++) {
            char c = email.charAt(i);
            if (Character.isUpperCase(c)) {
                return false;
            }
        }

        return true;
    }

}
// Código feito por eles

//public static boolean validar(String email) {
//    int posicaoArroba = email.indexOf("@");
//    int posicaoSufixo = email.lastIndexOf(".");
//
//    if (posicaoArroba == -1) return false;
//    if (posicaoSufixo <= posicaoArroba) return false;
//
//    String nomeUsuario = email.substring(0, posicaoArroba);
//    String nomeDominio = email.substring(posicaoArroba + 1, posicaoSufixo);
//    String sufixoDominio = email.substring(posicaoSufixo + 1);
//
//    if (!validarNomeUsuario(nomeUsuario)) return false;
//    if (!validarNomeDominio(nomeDominio)) return false;
//
//    return validarSufixoDominio(sufixoDominio);
//}
//
//private static boolean validarNomeUsuario(String nomeUsuario) {
//    if (nomeUsuario.isEmpty()) return false;
//
//    return validarCaracteresEmParteDoEmail(nomeUsuario, true,
//            true, '_', '-', '.');
//}
//
//private static boolean validarNomeDominio(String nomeDominio) {
//    if (nomeDominio.isEmpty()) return false;
//
//    return validarCaracteresEmParteDoEmail(nomeDominio, false,
//            true, '-', '.');
//}
//
//private static boolean validarSufixoDominio(String sufixoDominio) {
//    if (sufixoDominio.length() != 2 && sufixoDominio.length() != 3) return false;
//
//    return validarCaracteresEmParteDoEmail(sufixoDominio, false, false);
//}
//
//private static boolean validarCaracteresEmParteDoEmail(String parte, boolean aceitaMaiusculos,
//                                                       boolean aceitaDigitos, Character... caracteresExtrasAceitos) {
//    for (int i = 0; i < parte.length(); i++) {
//        char caractere = parte.charAt(i);
//        if (!validarCaractere(caractere, aceitaMaiusculos, aceitaDigitos, caracteresExtrasAceitos)) {
//            return false;
//        }
//    }
//
//    return true;
//}
//
//private static boolean validarCaractere(Character caractere, boolean aceitaMaiusculo,
//                                        boolean aceitaDigito, Character... caracteresExtrasAceitos) {
//    List<Character> caracteresExtras = Arrays.asList(caracteresExtrasAceitos);
//
//    return (Character.isLetter(caractere) && (aceitaMaiusculo || Character.isLowerCase(caractere)))
//            || (aceitaDigito && Character.isDigit(caractere))
//            || caracteresExtras.contains(caractere);
//}