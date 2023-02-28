import java.io.IOException;
import java.util.ArrayList;


public class Word {

 String[] words = new String[]{"lion", "ford", "chat", "cahier", "banane", "Rabat"};
 ArrayList<Integer> indicesWords=new ArrayList<>();

 public Word (){
  this.words=words;
  this.indicesWords=indicesWords;

 }

 public int getWord() throws IOException {
  int Max=words.length-1;

  int Min=0;

  int indice = Min + (int)(Math.random() * ((Max - Min) + 1));

  while(indicesWords.indexOf(indice)!=-1 && indicesWords.size()<words.length){
   indice = Min + (int)(Math.random() * ((Max - Min) + 1));
  }
  if(indicesWords.size()<words.length) {
   indicesWords.add(indice);
   return indice;
  }else{
   return -1;

  }
 }
     public  boolean LettreExist(String ourword,String str){

  if( ourword.contains(str.toUpperCase())){
   return true;
  }
  return false;
 }

 public  String initialiseWord(String word){
  String ns="";
  for(int i=0;i<word.length();i++){
   ns+=" _ ";
  }
  return ns;
 }
 public static ArrayList<Integer> getAllIndices(String word,String ch){
  ArrayList<Integer> indices = new ArrayList<>();
  int index = word.indexOf(ch.toUpperCase());
  while (index != -1) {
   indices.add(index);
   index = word.indexOf(ch.toUpperCase(), index + 1);
  }
  return indices;
 }

 }
