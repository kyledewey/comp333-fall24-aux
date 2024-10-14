public class UnlockedLock implements Lock {
    public UnlockedLock() {}
    
    public Lock lock() {
        System.out.println("lock locked");
        return new LockedLock();
    }
    
    public Lock unlock() {
        System.out.println("lock already unlocked");
        return this;
    }
    
    public boolean isLocked() {
        return false;
    }
}    
