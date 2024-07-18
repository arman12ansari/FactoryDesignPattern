public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme() {
        System.out.println("Theme is being set");
    }

    public void setRefreshRate() {
        System.out.println("Refresh rate is being set");
    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
