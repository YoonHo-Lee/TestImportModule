package io.card.payment.i18n.locales;

import java.util.HashMap;
import java.util.Map;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;

// Class autogenerated!  Do not modify.
// Generated on 2014-12-10 11:29:25.147236 via script:
// /Users/twhipple/Documents/buffalo/lib-i18n/i18n/script/generate_android_i18n.py -java_src_path src/ -java_gen_path gen/ -stringkey_path io/card/payment/i18n/ -strings_path ../strings/projects/card.io/strings/ --strict

public class LocalizedStringsIS implements SupportedLocale<StringKey> {

    private static Map<StringKey, String> mDisplay = new HashMap<>();
    private static Map<String, String> mAdapted = new HashMap<>();

    @Override
    public String getName() {
        return "is";
    }

    @Override
    public String getAdaptedDisplay(StringKey key, String country) {
        String adaptedKey = key.toString() + "|" + country;
        if (mAdapted.containsKey(adaptedKey)) {
            return mAdapted.get(adaptedKey);
        } else {
            return mDisplay.get(key);
        }
    }

    public LocalizedStringsIS() {
        mDisplay.put(StringKey.CANCEL, "Hætta við");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Lokið");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "Póstnúmer");
        mDisplay.put(StringKey.ENTRY_CARDHOLDER_NAME, "Nafn Korthafa");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Rennur út");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/ÁÁ");
        mDisplay.put(StringKey.SCAN_GUIDE, "Haltu kortinu kyrru hér.\nÞað verður sjálvirkt skannað.");
        mDisplay.put(StringKey.KEYBOARD, "Lyklaborð…");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Kortanúmar");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Kortaupplýsingar");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Þetta tæki getur ekki notað myndavélina til að lesa af númer af kortinu.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Ekki næst samband við myndavélina.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Upp kom villa við að opna myndavélina..");

        // no adapted_translations found
    }
}