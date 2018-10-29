context('Test HTML Tutorial', () => {
    // Run before every it()
    beforeEach(() => {
        cy.visit('https://www.w3schools.com/');
        cy.get('div.w3-bar')
            .contains('TUTORIALS')
            .click();
        cy.get('a.w3-bar-item.w3-button')
            .contains('Learn HTML')
            .click({force: true});
    });

    it('test location', () => {
        // Test current URL
        cy.location('pathname').should('include', 'html/default.asp');

        // Test previous URL
        cy.go('back');
        cy.location('pathname').should('not.include', 'html/default.asp');

        // Test forww=ard URL
        cy.go('forward');
        cy.location('pathname').should('include', 'html/default.asp');
    });

    it('test title of view', () => {
        // Test title of site
        cy.get('div#main>h1').should('have.text', 'HTML5 Tutorial');
    });

    it('test home button', () => {
        // Test Home
        cy.get('.w3-left.w3-btn')
            .contains('❮ Home')
            .click();
        cy.location('pathname').should('include', 'default.asp');

        // Test previous URL
        cy.go('back');
        cy.location('pathname').should('not.include', 'html/html_intro.asp');
    });

    it('test next button', () => {
        // Test Next
        cy.get('.w3-right.w3-btn')
            .contains('Next ❯')
            .click();
        cy.location('pathname').should('include', 'html/html_intro.asp');
        cy.get('div#main>h1').should('have.text', 'HTML Introduction');

        // Test previous URL
        cy.go('back');
        cy.location('pathname').should('not.include', 'html/html_intro.asp');
    });
});
