'use strict';

/*******************************************************************************/
/**************************** DONNEES ******************************************/
/*******************************************************************************/

// Status du bouton afin de connaitre la position du bouton de déploiement de la navbar latérale
//var statusBoutonMenu;

/*******************************************************************************/
/**************************** FONCTIONS ****************************************/
/*******************************************************************************/

$(".club-detail-btn").click(function() {
	console.log($(this).data("val"));
	var id = $(this).data("val");
	$.get("addClub?clubId=" + id, function(data, status) {
		window.location.replace("http://localhost:8080/club/clubDetail?clubId=" + id);
		});
});


//// Initialisation des pages
//function init() {
//    // Le bouton de déploiement de la navbar à un status '0' --> navbar fermée et chervon ouvrant
//    statusBoutonMenu = false;
//    // Cacher la navbar
//    $(".nav-menu").toggle();
//    // Styler le bouton (état: bouton ouvrant)
//    $(".icone-menu")
//    .removeClass("fa-chevron-left")
//    .addClass("fa-chevron-right");
//}
//
//
//$(".btn-menu").click(function() {
//    // Vérifier état du bouton
//    if (statusBoutonMenu == false) {
//        // console.log("etat initial navbar déployé: " + statusBoutonMenu);
//        // Faire apparaitre la navbar latérale
//        $(".nav-menu")
//        .toggle()
//        // Modifier le bouton de déploiement de la navbar latérale
//        $(".icone-menu")
//        .removeClass("fa-chevron-right")
//        .addClass("fa-chevron-left")
//        // Replacer le bouton afin qu'il soit voyant
//        $(".btn-menu")
//        .css({marginLeft: "23rem"});
//        // Le bouton de déploiement de la navbar à un status '1' --> navbar ouverte et chervon fermant
//        statusBoutonMenu = true;
//        // console.log("etat final navbar déployé: " + statusBoutonMenu);
//        return;
//        // verifier état du bouton
//    } else if (statusBoutonMenu == true) {
//        // console.log("etat initial navbar déployé: " + statusBoutonMenu);
//        // Faire disparaitre la navbar latérale
//        $(".nav-menu")
//        .toggle()
//        // Modifier le bouton de déploiement de la navbar latérale
//        $(".icone-menu")
//        .removeClass("fa-chevron-left")
//        .addClass("fa-chevron-right")
//        // Replacer le bouton afin qu'il soit non génant
//        $(".btn-menu")
//        .css({marginLeft: "auto"});
//        // Le bouton de déploiement de la navbar à un status '0' --> navbar fermée et chervon ouvrant
//        statusBoutonMenu = false;
//        // console.log("etat final navbar déployé: " + statusBoutonMenu);
//        return;
//    }
//});





/*******************************************************************************/
/**************************** CODE PRINCIPAL ***********************************/
/*******************************************************************************/

// lorsque le document est chargé :
$( function() {
    // Initialiser le js
//    init();
});
