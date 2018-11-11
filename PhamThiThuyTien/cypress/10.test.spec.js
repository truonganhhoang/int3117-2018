context('Test', () => {
    beforeEach(() => {
        cy.visit('http://qunitjs.com/');
        cy.get('ul#menu-top')
            .contains('API Documentation')
            .click();
    });

    it('Module', () => {
        cy.get('ul.sidebar-list')
            .contains('module')
            .click();

        cy.location('pathname').should('include', 'module');
    });

    it('Only', () => {
        cy.get('ul.sidebar-list')
            .contains('skip')
            .click();

        cy.location('pathname').should('include', 'skip');
    });

    it('Skip', () => {
        cy.get('ul.sidebar-list')
            .contains('skip')
            .click();

        cy.location('pathname').should('include', 'skip');
    });

    it('Start', () => {
        cy.get('ul.sidebar-list')
            .contains('start')
            .click();

        cy.location('pathname').should('include', 'start');
    });

    it('Test', () => {
        cy.get('ul.sidebar-list')
            .contains('test')
            .click();

        cy.location('pathname').should('include', 'test');
    });

    it('Todo', () => {
        cy.get('ul.sidebar-list')
            .contains('todo')
            .click();

        cy.location('pathname').should('include', 'todo');
    });
});
