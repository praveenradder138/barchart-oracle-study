/*    */ package org.omg.IOP.CodecPackage;
/*    */ 
/*    */ import org.omg.CORBA.UserException;
/*    */ 
/*    */ public final class TypeMismatch extends UserException
/*    */ {
/*    */   public TypeMismatch()
/*    */   {
/* 16 */     super(TypeMismatchHelper.id());
/*    */   }
/*    */ 
/*    */   public TypeMismatch(String paramString)
/*    */   {
/* 22 */     super(TypeMismatchHelper.id() + "  " + paramString);
/*    */   }
/*    */ }

/* Location:           /home/user1/Temp/jvm/rt.jar
 * Qualified Name:     org.omg.IOP.CodecPackage.TypeMismatch
 * JD-Core Version:    0.6.2
 */