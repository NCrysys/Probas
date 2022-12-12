/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.probas;

/**
 *
 * @author a22noellr
 */

//Este é o cambio que fago sobre o Proxecto de Noel

import java.util.Scanner;

public class Probas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n=entrada.nextInt();
        n=entrada.nextInt();
        System.out.println(n);
    }
}

paco.engadirAmigo(Perfil base.buscarPerfil(Paco))

public void iniciarSesion() {
    System.out.println(nome);
    System.out.println(contrasinal);
    p=obterPerfil()
    while(p==null) {
        usuario non existe
        nome
        contraseña
        p=obterPerfil()
    }
    
}

'tes ' + p.solicitudes.size() + ' solicitudes de amistade'
mostrarSolicitudesAmizade(p)
for (int i = 0; i < p.solicitudes.size(); i++) {
    System.out.println(i+1 + '-' + p.solicitudes.get(i).getNome());
}
1-paco 
2-pepe
3-fernando
administrar solicitudes ou enviar unha solicitude
engadirSolicitude()
System.out.println('elixe solicitude');
Scanner entrada=new Scanner(System.in);
int solicitante=entrada.nextInt();
System.out.println('aceptar ou denegar');
1-aceptar-> aceptarSolicitude(p.solicitudes.get(solicitante-1))
2-denegar-> rexeitarSolicitude(p.solicitudes.get(solicitante-1))



'tes ' + p.amigos.size() + ' amigos'
mostrarListaAmigos(p)
for (int i = 0; i < p.amigos.size(); i++) {
    System.out.println(i+1 + '-' + p.amigos.get(i).getNome() + ': ' + p.amigos.get(i).getEstado);
}
1-paco: francisco
2-pepe: franco
3-fernando: rajoy
'ver biografia ou enviar mensaxe'


//enviar mensaxe
escribirMensaxe(Perfil remitente, Perfil destinatario)
    String texto=entrada.nextLine();
    Mensaxe m= new Mensaxe(texto, remitente)
    destinatario.engadirMensaxePrivada(m)