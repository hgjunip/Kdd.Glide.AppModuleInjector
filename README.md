# Xamarin Android - Glide untrusted certificate implementation (AppModuleInjector, UnsafeUrlLoadingAppGlideModule)

This is a solution to let Xamarin Android Glide to work with Untrusted certificates.

Instruction:
1. Install 2 nuget packages on your Xamarin.Android project:
- https://www.nuget.org/packages/Kdd.Glide.AppModuleInjector/
- https://www.nuget.org/packages/Kdd.Glide.UnsafeUrlLoadingAppGlideModule/

2. Add this snippet into AppStartActivity.cs
  GlideAppModuleInjector.Inject(new UnsafeUrlLoadingAppGlideModule());
  
3. Enjoy using!

