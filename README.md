#  AppGlideModule injector - tool for injecting any App Module to Glide

This package gives the ability to inject any AppGlideModule class instance into Glide by C# code.
Instruction:
1. Install nuget package to your Xamarin.Android project: 
    - https://www.nuget.org/packages/Kdd.Glide.AppModuleInjector/

2. Implement your custom class which will be inherited from AppGlideModule class:
    >`public class MyAppGlideModule : Bumptech.Glide.Module.AppGlideModule { ... }`

3. Inject instance of this class during application startup:
    >`Kdd.Glide.AppModuleInjector.GlideAppModuleInjector.Inject(new MyAppGlideModule());`

4. Enjoy using it!

# Unsafe Url Loading AppGlideModule - module for loading images with untrusted (self-signed) certificates

This package gives the ability to load images from sources with untrusted (self-signed) certificates

Instruction:
1. Install 2 nuget packages on your Xamarin.Android project:
    - https://www.nuget.org/packages/Kdd.Glide.AppModuleInjector/
    - https://www.nuget.org/packages/Kdd.Glide.UnsafeUrlLoadingAppGlideModule/

2. Inject instance of `UnsafeUrlLoadingAppGlideModule` during application startup:
    >`GlideAppModuleInjector.Inject(new UnsafeUrlLoadingAppGlideModule());`
  
3. Enjoy using it!
