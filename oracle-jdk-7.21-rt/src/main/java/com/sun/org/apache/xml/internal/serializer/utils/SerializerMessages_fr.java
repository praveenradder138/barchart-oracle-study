/*     */ package com.sun.org.apache.xml.internal.serializer.utils;
/*     */ 
/*     */ import java.util.ListResourceBundle;
/*     */ 
/*     */ public class SerializerMessages_fr extends ListResourceBundle
/*     */ {
/*     */   public Object[][] getContents()
/*     */   {
/*  30 */     Object[][] contents = { { "ER_SERIALIZER_NOT_CONTENTHANDLER", "La classe de la méthode de sérialisation ''{0}'' n''implémente pas org.xml.sax.ContentHandler." }, { "ER_RESOURCE_COULD_NOT_FIND", "La ressource [ {0} ] est introuvable.\n {1}" }, { "ER_RESOURCE_COULD_NOT_LOAD", "La ressource [ {0} ] n''a pas pu charger : {1} \n {2} \n {3}" }, { "ER_BUFFER_SIZE_LESSTHAN_ZERO", "Taille du tampon <=0" }, { "ER_INVALID_UTF16_SURROGATE", "Substitut UTF-16 non valide détecté : {0} ?" }, { "ER_OIERROR", "Erreur d''E-S" }, { "ER_ILLEGAL_ATTRIBUTE_POSITION", "Ajout impossible de l''attribut {0} après des noeuds enfants ou avant la production d''un élément.  L''attribut est ignoré." }, { "ER_NAMESPACE_PREFIX", "L''espace de noms du préfixe ''{0}'' n''a pas été déclaré." }, { "ER_STRAY_NAMESPACE", "La déclaration d''espace de noms ''{0}''=''{1}'' est à l''extérieur de l''élément." }, { "ER_COULD_NOT_LOAD_RESOURCE", "Impossible de charger ''{0}'' (vérifier CLASSPATH), les valeurs par défaut sont donc employées " }, { "ER_COULD_NOT_LOAD_METHOD_PROPERTY", "Impossible de charger le fichier de propriétés ''{0}'' pour la méthode de sortie ''{1}'' (vérifier CLASSPATH)" }, { "ER_INVALID_PORT", "Numéro de port non valide" }, { "ER_PORT_WHEN_HOST_NULL", "Le port ne peut être défini quand l'hôte est vide" }, { "ER_HOST_ADDRESS_NOT_WELLFORMED", "L'hôte n'est pas une adresse bien formée" }, { "ER_SCHEME_NOT_CONFORMANT", "Le processus n'est pas conforme." }, { "ER_SCHEME_FROM_NULL_STRING", "Impossible de définir le processus à partir de la chaîne vide" }, { "ER_PATH_CONTAINS_INVALID_ESCAPE_SEQUENCE", "Le chemin d'accès contient une séquence d'échappement non valide" }, { "ER_PATH_INVALID_CHAR", "Le chemin contient un caractère non valide : {0}" }, { "ER_FRAG_INVALID_CHAR", "Le fragment contient un caractère non valide" }, { "ER_FRAG_WHEN_PATH_NULL", "Le fragment ne peut être défini quand le chemin d'accès est vide" }, { "ER_FRAG_FOR_GENERIC_URI", "Le fragment ne peut être défini que pour un URI générique" }, { "ER_NO_SCHEME_IN_URI", "Processus introuvable dans l''URI : {0}" }, { "ER_CANNOT_INIT_URI_EMPTY_PARMS", "Impossible d'initialiser l'URI avec des paramètres vides" }, { "ER_NO_FRAGMENT_STRING_IN_PATH", "Le fragment ne doit pas être indiqué à la fois dans le chemin et dans le fragment" }, { "ER_NO_QUERY_STRING_IN_PATH", "La chaîne de requête ne doit pas figurer dans un chemin et une chaîne de requête" }, { "ER_NO_PORT_IF_NO_HOST", "Le port peut ne pas être spécifié si l'hôte n'est pas spécifié" }, { "ER_NO_USERINFO_IF_NO_HOST", "Userinfo ne peut être spécifié si l'hôte ne l'est pas" }, { "ER_SCHEME_REQUIRED", "Processus requis !" } };
/*     */ 
/* 120 */     return contents;
/*     */   }
/*     */ }

/* Location:           /home/user1/Temp/jvm/rt.jar
 * Qualified Name:     com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_fr
 * JD-Core Version:    0.6.2
 */