public interface Subject {
    /**
     * Allows observer to be registered and Unregistered to a subeject
     * 
     * @param observer the observer that will be observing
     */
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
