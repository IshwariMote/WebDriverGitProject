package seleniumExample;

public class gitCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * git init Initializes a new Git repository in the current directory.
		 * 
		 * bash --> git init git clone <repository-url> Clones an existing
		 * repository from a remote server (e.g., GitHub) to your local machine.
		 * 
		 * bash --> git clone https://github.com/user/repo.git git status Shows
		 * the status of the working directory and staging area, including untracked,
		 * modified, or staged files.
		 * 
		 * bash --> git status git add <file> Adds changes in the working
		 * directory to the staging area.
		 * 
		 * bash --> git add filename.txt To add all changes:
		 * 
		 * bash --> git add . git commit -m "message" Records the changes in the
		 * repository with a message describing what was changed.
		 * 
		 * bash --> git commit -m "Added new feature" git push Pushes the local
		 * commits to the remote repository.
		 * 
		 * bash --> git push origin main git pull Fetches changes from the remote
		 * repository and merges them into your local repository.
		 * 
		 * bash --> git pull origin main 2. Branching and Merging: git branch
		 * Lists all branches in the repository. The current branch is highlighted with
		 * an asterisk.
		 * 
		 * bash --> git branch git branch <branch-name> Creates a new branch.
		 * 
		 * bash --> git branch new-feature git checkout <branch-name> Switches to
		 * the specified branch.
		 * 
		 * bash --> git checkout new-feature git merge <branch-name> Merges the
		 * specified branch into the current branch.
		 * 
		 * bash --> git merge new-feature git branch -d <branch-name> Deletes the
		 * specified branch after merging.
		 * 
		 * bash --> git branch -d new-feature 3. Undoing Changes: git reset --hard
		 * <commit> Resets the working directory and staging area to a specified commit,
		 * discarding all changes after that commit.
		 * 
		 * bash --> git reset --hard abc1234 git checkout -- <file> Discards
		 * changes in the working directory for a specific file, reverting it to the
		 * last committed state.
		 * 
		 * bash --> git checkout -- filename.txt git revert <commit> Reverts a
		 * specific commit by creating a new commit that undoes the changes made by the
		 * specified commit.
		 * 
		 * bash --> git revert abc1234 4. Working with Remotes: git remote -v
		 * Lists all remotes associated with the repository.
		 * 
		 * bash --> git remote -v git remote add <name> <url> Adds a new remote
		 * repository.
		 * 
		 * bash --> git remote add origin https://github.com/user/repo.git git
		 * fetch Fetches changes from the remote repository but does not merge them.
		 * 
		 * bash --> git fetch origin git push -u origin <branch-name> Pushes a new
		 * branch to the remote repository and sets the upstream branch for future
		 * pushes.
		 * 
		 * bash --> git push -u origin new-feature 5. Viewing History: git log
		 * Displays the commit history.
		 * 
		 * bash --> git log git log --oneline Shows a simplified commit history,
		 * displaying only the commit hash and message.
		 * 
		 * bash --> git log --oneline 
		 * 
		 * 6. Stashing Changes: git stash Saves changes
		 * in the working directory without committing them, allowing you to work on
		 * something else.
		 * 
		 * bash --> git stash git stash apply Applies the most recent stashed
		 * changes.
		 * 
		 * bash --> git stash apply git stash list Lists all stashed changes.
		 * 
		 * bash --> git stash list git stash drop Deletes the most recent stash.
		 * 
		 * bash --> git stash drop 
		 * 
		 *7. Comparing Changes: git diff Shows the
		 * changes between the working directory and the staging area.
		 * 
		 * bash --> git diff git diff --staged Shows the changes between the
		 * staging area and the last commit.
		 * 
		 * bash --> git diff --staged
		 */

	}

}
