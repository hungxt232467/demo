 class NativeModifier {
    native void nativeMetho();
    static {
        System.loadLibrary("NativeMethodDefinetion");
    }
    public static void main(String[]args){
        NativeModifier objNative = newNativeMdifier();
        objNative.nativeMetho();
    }
}
