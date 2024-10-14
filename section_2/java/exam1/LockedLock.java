public class LockedLock implements Lock {
    public LockedLock() {}

    public Lock lock() {
        System.out.println("lock already locked");
        return this;
    }
    
    public Lock unlock() {
        System.out.println("lock unlocked");
        return new UnlockedLock();
    }
    
    public boolean isLocked() {
        return true;
    }
}
