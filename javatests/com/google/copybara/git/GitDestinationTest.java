import com.google.copybara.util.console.Message.MessageType;
        .matchesNext(MessageType.PROGRESS, "Git Destination: Cloning destination")
        .matchesNext(MessageType.PROGRESS, "Git Destination: Adding all files")
        .matchesNext(MessageType.PROGRESS, "Git Destination: Excluding files")
    repo().withWorkTree(workdir)
        .add().files("excluded").run();
    repo().withWorkTree(workdir)
        .add().files("foo/bar").run();
          .add().files("excluded.dat").run();
    scratchRepo.add().files("b1.file").run();
    scratchRepo.add().files("b2.file").run();
        .add().files("excluded.txt").run();
        .add().files("notgit/HEAD").run();
    repo().withWorkTree(scratchTree).add().force().files(".gitignore").run();