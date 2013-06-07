/*    */ package org.omg.PortableServer.CurrentPackage;
/*    */ 
/*    */ import org.omg.CORBA.Any;
/*    */ import org.omg.CORBA.ORB;
/*    */ import org.omg.CORBA.StructMember;
/*    */ import org.omg.CORBA.TypeCode;
/*    */ import org.omg.CORBA.portable.InputStream;
/*    */ import org.omg.CORBA.portable.OutputStream;
/*    */ 
/*    */ public abstract class NoContextHelper
/*    */ {
/* 13 */   private static String _id = "IDL:omg.org/PortableServer/Current/NoContext:1.0";
/*    */ 
/* 28 */   private static TypeCode __typeCode = null;
/* 29 */   private static boolean __active = false;
/*    */ 
/*    */   public static void insert(Any paramAny, NoContext paramNoContext)
/*    */   {
/* 17 */     OutputStream localOutputStream = paramAny.create_output_stream();
/* 18 */     paramAny.type(type());
/* 19 */     write(localOutputStream, paramNoContext);
/* 20 */     paramAny.read_value(localOutputStream.create_input_stream(), type());
/*    */   }
/*    */ 
/*    */   public static NoContext extract(Any paramAny)
/*    */   {
/* 25 */     return read(paramAny.create_input_stream());
/*    */   }
/*    */ 
/*    */   public static synchronized TypeCode type()
/*    */   {
/* 32 */     if (__typeCode == null)
/*    */     {
/* 34 */       synchronized (TypeCode.class)
/*    */       {
/* 36 */         if (__typeCode == null)
/*    */         {
/* 38 */           if (__active)
/*    */           {
/* 40 */             return ORB.init().create_recursive_tc(_id);
/*    */           }
/* 42 */           __active = true;
/* 43 */           StructMember[] arrayOfStructMember = new StructMember[0];
/* 44 */           Object localObject1 = null;
/* 45 */           __typeCode = ORB.init().create_exception_tc(id(), "NoContext", arrayOfStructMember);
/* 46 */           __active = false;
/*    */         }
/*    */       }
/*    */     }
/* 50 */     return __typeCode;
/*    */   }
/*    */ 
/*    */   public static String id()
/*    */   {
/* 55 */     return _id;
/*    */   }
/*    */ 
/*    */   public static NoContext read(InputStream paramInputStream)
/*    */   {
/* 60 */     NoContext localNoContext = new NoContext();
/*    */ 
/* 62 */     paramInputStream.read_string();
/* 63 */     return localNoContext;
/*    */   }
/*    */ 
/*    */   public static void write(OutputStream paramOutputStream, NoContext paramNoContext)
/*    */   {
/* 69 */     paramOutputStream.write_string(id());
/*    */   }
/*    */ }

/* Location:           /home/user1/Temp/jvm/rt.jar
 * Qualified Name:     org.omg.PortableServer.CurrentPackage.NoContextHelper
 * JD-Core Version:    0.6.2
 */