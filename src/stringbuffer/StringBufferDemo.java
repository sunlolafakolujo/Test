package stringbuffer;


public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.append("In God I trust"));
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String str=new String(chars);
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.length());
        System.out.println(sb);
        buffer.insert(14,", oh yes");
        System.out.println(buffer);
        //setCharAt()
        buffer.setCharAt(19,'Y');
        System.out.println(buffer);
        //length() method
        System.out.println(buffer.length());
        String string=new String("All is well");
        StringBuffer buffer1=new StringBuffer(string);
        System.out.println(buffer1);
        //capacity() method
        System.out.println(buffer1.capacity());
        StringBuffer buffer2=new StringBuffer(buffer1.substring(4,11));
        System.out.println(buffer2);
        buffer2.insert(0,"It ");
        System.out.println(buffer2);
        //delete() method
        buffer2.delete(6,10);
        System.out.println(buffer2);
        buffer2.insert(6,"in God's hand");
        System.out.println(buffer2);
        //append() method
        buffer2.append('s');
        System.out.println(buffer2);
        //charAt() method
        System.out.println(buffer2.charAt(4));
        //reverse() method
        System.out.println(buffer2.reverse());
        System.out.println(buffer2);
        //replace() method
        StringBuffer buffer3=buffer2.replace(0,20,"It's in God's hands");
        System.out.println(buffer3);
        //capacity() method
        StringBuffer buffer4=new StringBuffer("abc");
        System.out.println(buffer4.capacity());
        buffer4.trimToSize();
        System.out.println(buffer4.capacity());

    }


}
