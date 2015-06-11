package mod.HellCoder.Localization;

import net.minecraftforge.fml.common.registry.LanguageRegistry;

public class LocalizationHandler
 {
     private static final String LANG_RESOURCE_LOCATION = "/assets/hc/lang/";
     public static String[] localeFiles = { "/assets/hc/lang/en_US.xml" };

   public static void loadLanguages()
   {
     for (String localizationFile : localeFiles)
       LanguageRegistry.instance().loadLocalization(localizationFile, mod.HellCoder.Localization.LocalizationUtil.getLocaleFromFileName(localizationFile), mod.HellCoder.Localization.LocalizationUtil.isXMLLanguageFile(localizationFile));
   }
}
