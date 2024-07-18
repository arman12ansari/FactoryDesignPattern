public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform) {
        switch (supportedPlatform) {
            case ANDROID: return new AndroidUIFactory();
            case IOS: return new MacUIFactory();
        }
        return null;
    }
}
