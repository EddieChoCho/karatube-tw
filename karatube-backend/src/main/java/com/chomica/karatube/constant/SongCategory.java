package com.chomica.karatube.constant;

public enum SongCategory {
   // ---------------------------------------------------------------
   OTHER(0),
   CHINESE(1),
   TAIWANESE(2),
   CANTONESE(3),
   ENGLISH(4),
   JAPANESE(5),
   KOREAN(6),
   HAKKA(7)
   ;
   
   // ---------------------------------------------------------------
   private int code;
   
   // ---------------------------------------------------------------
   private SongCategory(int code) {
      this.code = code;
   }
   
   // ---------------------------------------------------------------
   public int code() {
      return this.code;
   }
   
   // ---------------------------------------------------------------
   public static SongCategory getCategory(int code) {
      for(SongCategory category : SongCategory.values()) {
         if(category.code == code) {
            return category;
         }
      }
      return null;
   }
}
