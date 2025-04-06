# !bin/bash
# make a add , commit and push to the remote repository
# Usage: ./push-merge.sh <commit message>
# Example: ./push-merge.sh "my commit message"
# Check if a commit message is provided
if [ -z "$1" ]; then
  echo "Usage: $0 <commit message>"
  exit 1
fi
# add all changes
git add .
# commit with the provided message
git commit -m "$1"
# push to the remote repository
git push
# merge the main branch into the current branch
git merge main
# rebase all the branches
git rebase